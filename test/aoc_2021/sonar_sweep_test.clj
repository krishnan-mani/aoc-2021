(ns aoc-2021.sonar-sweep-test
  (:require [clojure.test :refer :all]
            [aoc-2021.sonar-sweep :refer :all]))

(deftest map-to-delta-coll-test
  (is (= [2] (map-to-delta [1 3])))
  (is (= [2 4] (map-to-delta [1 3 7])))
  )

(deftest count-monotonic-increases-test
  (is (= [[1] [0 1]] (count-monotonic-increases [1 2 2 3 2]))))
