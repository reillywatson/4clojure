(fn z [k v]
  (when (and (first k) (first v))
    (merge {(first k) (first v)} (z (rest k) (rest v)))))
