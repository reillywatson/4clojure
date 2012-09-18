(fn a [sep x]
  (concat (mapcat list x (repeat (- (count x) 1) sep)) [(last x)]))
