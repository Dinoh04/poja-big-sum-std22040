package com.poja.bigSum.endpoint;


@RestController
public class BigsumControler {
    @GetMapping("/big-sum")
    public String calculateBigSum(@RequestParam("a") String a, @RequestParam("b") String b) {
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        BigInteger sum = numA.add(numB);

        return sum.toString();
    }
}
