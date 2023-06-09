(ns fizzbuzz)

(defn es-divisible-entre?
  [num denom]
  (if (= (mod num denom) 0)
    true
    false))

(defn fizzbuzz
  [n]
  (let [coll (range 1 (+ 1 n))]
    (mapv (fn [x]
            (cond
              (and (es-divisible-entre? x 3) (es-divisible-entre? x 5)) "FizzBuzz"
              (es-divisible-entre? x 3) "Fizz"
              (es-divisible-entre? x 5) "Buzz"
               :else x))
          coll)))

;;fizzbuzz
;;divisible entre 3 fizz
;;divisible entre 5 buzz
;;divisible entre 3 y 5 fizzbuzz
;;else n

(comment 
  (es_divisible_entre? 10 2))