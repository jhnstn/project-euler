;If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

;Find the sum of all the multiples of 3 or 5 below 1000.
;
(loop [sum 0 cnt 999]
    ; If count reaches 0 then exit the loop and return sum
    (if (= cnt 0)
    sum
    ;  If a multiple of 3 or 5 add to sum and recur with new values
    ;  Otherwise recur with sum as it is
      (if (or (=  0 (mod cnt 3)) (= 0 (mod cnt 5)))
        (recur (+ cnt sum) (dec cnt))
        (recur sum (dec cnt)))))
