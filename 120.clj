(fn smaller_than_sum_of_squared_digits [args]
(letfn  [
        (digits [num] (map #(Character/digit % 10) (str num)))
        (squared_digits [x] (reduce (fn [a b] (+ a (* b b))) (digits x)))
        (has_smaller_squared_digits [x] (< x (squared_digits x)))]
  (count (filter has_smaller_squared_digits args))))

