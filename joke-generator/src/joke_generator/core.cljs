(ns joke-generator.core
  (:require [cljs-lambda.macros :refer-macros [defgateway]]))

(def jokes
  [{:setup "A guy walked into a bar..." :punchline "ouch!"}
   {"setup" "2A guy walked into a bar...", "punchline" "2ouch!"}
   {"setup" "3A guy walked into a bar...", "punchline" "3ouch!"}])

(defn getJokeFromLocalArray []
  (nth jokes (rand-int (count jokes))))

(defgateway echo [event ctx]
  (getJokeFromLocalArray))