(ns aoc-2021.sonar-sweep-test
  (:require [clojure.test :refer :all]
            [aoc-2021.sonar-sweep :refer :all]))

(deftest count-monotonic-increases-test
  (is (= 0 (count-monotonic-increases []))))
