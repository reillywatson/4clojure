reduce (fn [seen x] (if (some #{x} seen) seen (conj seen x))) []
