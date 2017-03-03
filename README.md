#Methods Should Do Only One Thing

##Detail
A method should do only one thing at a time.
And it should be related with their name.

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
```

This one is better.
```Java
public boolean checkCart() {
	return (this.product.isEmpty());
}

public String takeALook() {
	return (this.product.peek)());
}
```



##Here is an exercise.
- [Ex.1](https://github.com/Non9441/codeguide/blob/master/src/codeguide/Cart.java
)

##Reference

Code from a book , "Java for small teams".

written by Henry Coles and numerous contributors.

https://www.gitbook.com/book/ncrcoe/java-for-small-teams/details

#Prefer Immutable Objects

Where possible, create objects that cannot be changed - especially if those objects will be long-lived or globally accessible.

##Detail

You should know how to create an immutable objects and when will you need them. It would let you deal with your program easier.

To make your objects immutable is that some of it's attribute should not be modifiable after once it's been created.

This is some example

```Java
@Immutable
public final class Bar {
  private int anInt;
  private String aString;

  public Bar(int anInt, String aString) {
    this.anInt = anInt;
    this.aString = aString;
  }


  @CheckReturnValue
  public Bar withAnInt(int anInt) {
    return new Bar(anInt, this.aString);
  }

  @CheckReturnValue
  public Bar withAString(String aString) {
    return new Bar(this.antInt, aString);
  }
}
```
##Exercise 2

- [Ex.2](https://github.com/Non9441/codeguide/blob/master/src/codeguide/Person.java)

##Reference

Code from a book , "Java for small teams".

written by Henry Coles and numerous contributors.

https://www.gitbook.com/book/ncrcoe/java-for-small-teams/details
