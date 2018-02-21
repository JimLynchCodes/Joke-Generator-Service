(ns fresh-cljs-lambda.test-runner
 (:require [doo.runner :refer-macros [doo-tests]]
           [fresh-cljs-lambda.core-test]
           [cljs.nodejs :as nodejs]))

(try
  (.install (nodejs/require "source-map-support"))
  (catch :default _))

(doo-tests
 'fresh-cljs-lambda.core-test)
