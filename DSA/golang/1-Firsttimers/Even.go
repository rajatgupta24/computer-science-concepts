package main

import "fmt"

func main() {

	fmt.Print("Enter a number ")

	var num int

	fmt.Scan(&num)

	if num%2 == 0 {
		fmt.Println(num, "is even")
	} else {
		fmt.Println(num, "is odd")
	}
}
