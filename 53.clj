(fn lsubseq 
  ([s] (lsubseq s '() '()))
  ([s longest current]
  (let [fs (list (first s))]
  (if (empty? s) longest
  (if (empty? current) (lsubseq (rest s) longest fs)
  (if (> (first s) (last current))
    (if (>= (count current) (count longest))
      (lsubseq (rest s) (concat current fs) (concat current fs))
      (lsubseq (rest s) longest (concat current fs)))
  (lsubseq (rest s) longest fs)))))))
