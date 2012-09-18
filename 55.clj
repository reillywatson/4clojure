#(zipmap (keys (group-by identity %)) (map count (vals (group-by identity %))))
