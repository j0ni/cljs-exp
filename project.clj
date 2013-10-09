(defproject cljs-exp "0.1.0-SNAPSHOT"
  :description "playfulness"
  :url ""
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-1913"]]
  :plugins [[lein-cljsbuild "0.3.3"]]
  :cljsbuild {:builds [{:source-paths ["src/cljs_exp"],
                        :id "release",
                        :compiler {:output-to "cljs-exp.js",
                                   :optimizations :simple
                                   :target :nodejs}}]})
