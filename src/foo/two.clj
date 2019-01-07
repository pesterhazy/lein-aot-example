(ns foo.two
  (:require [cuerdas.core :as c]))

(defn run []
  (println (c/strip-tags "<p>just <b>some</b> text</p>")))

(println "ns-init foo.two")
