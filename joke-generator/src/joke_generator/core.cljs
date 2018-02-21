(ns joke-generator.core
  (:require [cljs-lambda.macros :refer-macros [defgateway]])
  )

(def jokes
  [{:setup "A guy walked into a bar..." :punchline "Ouch!" :clean? true}
   {:setup "Can a kangaroo jump higher than a house?" :punchline "Of course, a house doesn’t jump at all!" :clean? true}
   {:setup "Me: Do you think it’s strange to talk to yourself?" :punchLine "Me: No." :clean? true}
   {:setup "What happens to a frog's car when it breaks down?" :punchLine "It gets toad away!" :clean? true}
   {:setup "What do cats eat for breakfast?" :punchLine "Mice krispies!" :clean? true}
   {:setup "What did the egg say before it got boiled?" :punchLine "It's gonna take me awhile to get hard, I just got laid by a chick!" :clean? false}
   ])

(defn getRandomJoke []
  (nth jokes (rand-int (count jokes))))

(defgateway getJoke [event ctx]
  (getRandomJoke))