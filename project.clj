(defproject foo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :aot [foo.main]
  :main ^:skip-aot foo.main
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [funcool/cuerdas "2.0.5"]])
