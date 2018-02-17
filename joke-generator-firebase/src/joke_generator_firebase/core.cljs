(ns joke-generator-firebase.core
  (:require
;    [cljs-lambda.macros :refer-macros [defgateway]]
            [matchbox.core :as m]))

;(defgateway echo [event ctx]
;  {:status  200
;   :headers {:content-type (-> event :headers :content-type)}
;   :body    (event :body)})


(defn okthen [] (println "COOl"))


(def root (m/connect "https://<app>.firebaseio.com"))

(m/auth-anon root)

(m/listen-children
  root [:users :mike :friends]
  (fn [[event-type data]] (prn data)))

(def mikes-friends (m/get-in root [:users :mike :friends]))
(m/reset! mikes-friends [{:name "Kid A"} {:name "Kid B"}])
(m/conj! mikes-friends {:name "Jean"})

(m/deref
  mikes-friends
  (fn [key value]
    (m/reset-in! root [:users :mike :num-friends]
                 (count value))))

(m/unauth)