#Methods Should Do Only One Thing
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

Code from a book , "Java for small teams"
written by Henry Coles and numerous contributors.
https://www.gitbook.com/book/ncrcoe/java-for-small-teams/details