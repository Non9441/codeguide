#Methods Should Do Only One Thing

##Detail
A method should do only one thing at a time. And it should be related with their name.
This is some bad example. 

'''public void updateFooStatusAndRepository(Foo foo) {
     if ( foo.hasFjord() ) {
        this.repository(foo.getIdentifier(), this.collaborator.calculate(foo));
     }

     if (importantBusinessLogic()) {
       foo.setStatus(FNAGLED);
       this.collaborator.collectFnagledState(foo);
     }
  }'''

Here is a better one.

'''public void registerFoo(Foo foo) {
     handleFjords(foo);
     updateFnagledState(foo);
  }

  private void handleFjords(Foo foo) {
      if ( foo.hasFjord() ) {
        this.repository(foo.getIdentifier(), this.collaborator.calculate(foo));
     }
  }

  private void updateFnagledState(Foo foo) {
    if (importantBusinessLogic()) {
       foo.setStatus(FNAGLED);
       this.collaborator.collectFnagledState(foo);
     }
  }'''


##Here is an exercise.
- https://github.com/Non9441/codeguide/blob/master/src/codeguide/Cart.java

##Reference
Code from a book , "Java for small teams".
written by Henry Coles and numerous contributors.
https://www.gitbook.com/book/ncrcoe/java-for-small-teams/details