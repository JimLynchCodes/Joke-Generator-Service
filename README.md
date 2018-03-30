# Joke Generator Service

_An example of a simple ClojureScript backend lambda service using the cljs-lambda template._ 

## The "Fresh" Folders
This project is supposed to help newbies to get started creating AWS lambda functions with ClojureScript. The fresh folders _fresh-cljs-lambda_ and _fresh-serverless-cljs_ show example projects that are freshly scaffolded from [Cljs-lambda](https://github.com/nervous-systems/cljs-lambda) and [Serverless Cljs](https://github.com/nervous-systems/serverless-cljs-plugin) respectively.

## Joke Generator
The purpose of joke generator is to randomly return one "joke map" from a vector of maps called _jokes_. The core logic is in the _getRandomJoke_ function. This function, the def jokes, and the special cljs-lambda macro defgateway all live in the core.cljs file.

```
(ns joke-generator.core
  (:require [cljs-lambda.macros :refer-macros [defgateway]]))

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
```

## Usage
See the README inside of the joke-generator directory.
