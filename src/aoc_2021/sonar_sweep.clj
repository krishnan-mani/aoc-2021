(ns aoc-2021.sonar-sweep)

(defn count-monotonic-increases [vec]
  0
  )

(defn map-to-delta [coll]
  (let [truncated_coll (drop-last coll)
        offset_coll (drop 1 coll)]
    (map - offset_coll truncated_coll)))

