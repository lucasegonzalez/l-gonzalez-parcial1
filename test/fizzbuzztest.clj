(ns fizzbuzztest
  (:require [midje.sweet :refer :all]
            [clojure.test :refer :all]
            [fizzbuzz :refer [fizzbuzz]]))
(def t1 [1, 2, "Fizz", 4, "Buzz", "Fizz", 7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz", 16, 17, "Fizz", 19, "Buzz", "Fizz", 22, 23, "Fizz", "Buzz", 26, "Fizz", 28, 29, "FizzBuzz", 31, 32, "Fizz", 34, "Buzz", "Fizz"])

(fact
 (fizzbuzz 100) => vector?
 (fizzbuzz 36) => (just t1)

 (-> (fizzbuzz 20) (nth 14)) => "FizzBuzz")

(comment
  (t1 14
      (nth t1 14))
  )