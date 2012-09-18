(fn what [s]
  (if (= (merge s s) s) :map
  (if (= (count (conj s 1)) (count (conj (conj s 1) 1))) :set
  (if (= (last (conj (conj s :__fakeval__) :__otherfake__)) :__otherfake__) :vector
  :list))))
