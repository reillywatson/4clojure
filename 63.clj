(fn groupit [f s]
  (reduce #(merge-with concat % %2) (map #(array-map (f %) (vector %)) s)))
