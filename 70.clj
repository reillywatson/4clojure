(fn [x] (sort-by #(.toLowerCase %) (.split x "\\W+")))
