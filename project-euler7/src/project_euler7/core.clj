(ns project-euler7.core)

;skipping even numbers for speed

(defn prime? [n]
  (every? false? (map #(zero? (rem n %)) (range 3 (int (Math/sqrt n))))))

(def find-primes
  (lazy-cat [2 3]
            (filter prime? (iterate inc 5))))

(defn div? [n d]
  (= 0 (rem n d)))

(defn smallest-prime-factor [number]
  (loop [n number d 2]
    (cond (> d (int (Math/sqrt number))) n
          (= n d) n
          (div? n d) d
          true (recur n (inc d)))))

(def primes (lazy-cat [2 3]
                      (filter #(= % (smallest-prime-factor %))
                              (take-nth 2 (iterate inc 5)))))

(defn -main [& args]
  (println (nth primes 10000)))
