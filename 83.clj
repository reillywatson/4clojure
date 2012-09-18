(fn half [& more]
    (= true (and (some false? more) (some true? more))))
