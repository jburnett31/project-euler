(ns project-euler43.core
  (:require [clojure.math.combinatorics :as comb]))

(def permutations
  (comb/permutations "1234567890"))

(defn divisible [n]
  (loop [i (drop 1 n) d '(2 3 5 7 11 13 17) l true]
    (cond (empty? (next i)) l
          (zero? (mod (take 3 i) (first d))) (recur (drop 3 i) (next d) true)
          :else false)))

(defn problem43 [])

(defn -main [& args]
  (println (problem43)))
