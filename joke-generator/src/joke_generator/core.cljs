(ns joke-generator.core
  (:require [cljs-lambda.macros :refer-macros [defgateway]]))

(defn getJokeFromLocalArray []
  {"setup" "A guy walked into a bar...", "punchline" "ouch!"})


(defgateway echo [event ctx]
  {:status  200
   :headers {:content-type (-> event :headers :content-type)}
   :body    (getJokeFromLocalArray)})




;; Array oj Jokes
[{"setup" "A guy walked into a bar...", "punchline" "ouch!"}
 {"setup" "2A guy walked into a bar...", "punchline" "3ouch!"}
 {"setup" "3A guy walked into a bar...", "punchline" "3ouch!"}]