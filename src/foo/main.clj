(ns foo.main
  (:gen-class))

(println "ns-init foo.main")

(defn -main []
  (require 'foo.two)
  ((resolve 'foo.two/run)))
