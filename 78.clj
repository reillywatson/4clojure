(fn tramp [f & params]
  (if (fn? f) (recur (apply f params) '()) f))
