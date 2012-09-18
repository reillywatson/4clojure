(fn ([f1 f2] (fn [& args] (f1 (apply f2 args))))
  ([f1 f2 f3] (fn [& args] (f1 (f2 (apply f3 args))))))
