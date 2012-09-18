(fn chain [s]

(letfn [
  (caninsert [a b]
    (if (= a b)
          true
        (if (and (empty? a) (= (.length b) 1))
              true
            (if (= (first a) (first b))
                  (caninsert (apply str (rest a)) (apply str (rest b)))
                (= (str (first b) a) b)))))
  
  (canremove [a b]
      (caninsert b a))

