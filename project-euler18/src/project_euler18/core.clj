(ns project-euler18.core)

(def data [
           [75]
           [95 64]
           [17 47 82]
           [18 35 87 10]
           [20 04 82 47 65]
           [19 01 23 75 03 34]
           ])


(comment
  for i in a row the parents are (dec i) and i of (dec row)
  )

                                        ; left-most path will be all elements from the 0 position
                                        ;right-most path will be from the last position of each row
(defn trace-back [graph row col]
  (loop [y row x col m 0]
    (cond (zero? (dec y)) (+ m (nth (nth graph (dec y)) x))
          (zero? x) (recur (dec y) x (+ m (nth (nth graph (dec y)) x)))
          :else (let [m1 (nth (nth graph (dec y)) (dec x))
              m2 (nth (nth graph (dec y)) x)]
          (cond (> m1 m2) (recur (dec y) (dec x) (+ m1 m))
                :else (recur (dec y) x (+ m2 m)))))))

(defn problem18 [num-rows]
  )

(defn -main
  "I don't do a whole lot."
  [& args]
  (println "Hello, World!"))
