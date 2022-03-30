(ns aoc-2021.sonar-sweep)

(defn map-to-delta [coll]
  (let [truncated_coll (drop-last coll)
        offset_coll (drop 1 coll)]
    (map - offset_coll truncated_coll)))

(defn count-monotonic-increases [coll]
  (let [delta_coll (map-to-delta coll)]
    (loop [counts []
           positive-runs (first (split-with pos? delta_coll))
           rest-runs (last (split-with pos? delta_coll))]
      (if (empty? rest-runs)
        counts
        (recur (conj counts (count positive-runs))
               (first (split-with pos? rest-runs))
               (last (split-with pos? rest-runs)))
        )))
  ;(split-with pos? (map-to-delta coll))
  )



