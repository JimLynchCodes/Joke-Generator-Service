(defproject fresh-serverless-cljs "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure       "1.8.0"]
                 [org.clojure/clojurescript "1.8.51"]
                 [io.nervous/cljs-lambda    "0.3.5"]]
  :plugins [[lein-npm                    "0.6.2"]
            [io.nervous/lein-cljs-lambda "0.6.6"]]
  :npm {:dependencies [[serverless-cljs-plugin "0.1.2"]]}
  :cljs-lambda {:compiler
                {:inputs  ["src"]
                 :options {:output-to     "target/fresh-serverless-cljs/fresh_serverless_cljs.js"
                           :output-dir    "target/fresh-serverless-cljs"
                           :target        :nodejs
                           :language-in   :ecmascript5
                           :optimizations :none}}})
