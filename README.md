#Methods Should Do Only One Thing

##Detail
A method should do only one thing at a time. And it should be related with their name.
This is some bad example.

```Java
public boolean checkAndLook() {
	if (this.product.isEmpty()) {
		return false;
	}
	else {
		System.out.print(this.product.peek());
		return true;
	}
}//This one is bad.

//Take a look at this one.
public boolean checkCart() {
	return (this.product.isEmpty());
}

public String takeALook() {
	return (this.product.peek)());
}
```


##Here is an exercise.
- https://github.com/Non9441/codeguide/blob/master/src/codeguide/Cart.java

##Reference
Code from a book , "Java for small teams".
written by Henry Coles and numerous contributors.
https://www.gitbook.com/book/ncrcoe/java-for-small-teams/details
