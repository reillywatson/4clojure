(fn [& fs]
  (fn [& args]
    (map #(apply % args) fs)))
