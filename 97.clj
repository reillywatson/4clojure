(fn pascal [row]
  (letfn [(factorial [x] (if (zero? x) 1 (* x (factorial (- x 1)))))
			(nchooser [n r] (/ (factorial n) (* (factorial r) (factorial (- n r)))))]
	(map #(nchooser (dec row) %) (range row))))
