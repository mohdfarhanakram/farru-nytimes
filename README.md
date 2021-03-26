
# FarruNyTimes -
<h3>I am Mohd Farhan my nick name is Farru</h3><br/>

Build a simple app to hit the NY Times Most Popular Articles API and show a list of articles, that shows details when items on the list are tapped (a typical master/detail app).  We'll be using the most viewed section of this API.  http://api.nytimes.com/svc/mostpopular/v2/mostviewed/{section}/{period}.json?api- key=sample-key To test this API, you can use all-sections for the section path component in the URL above and 7 for period (available period values are 1, 7 and 30, which represents how far back, in days, the API returns results for). 


<hr/>

<h3> Applied technologies and libraries: </h3>
<ul>
<li><h3>Model</h3>

<h4><i>Retrofit 2</i></h4> - getting data from server and return response data 
<h4><i>Coroutines</i></h4> 
   - managing asynchronous network queries<br/>
   - using instead of callbacks<br/>
   - providing light asynchronous operations
</li>	 
<li><h3>ViewModel</h3>
<h4><i>LiveData</i></h4> - observer-pattern implementation for View interaction
</li>

<li><h3>View</h3>
<h4><i>Data Binding</i></h4> 
       - Use data binding to bind the data with UI<br/>
       - The expression language allows you to write expressions that connect variables to the views in the layout.<br/>  
       - Binding Library automatically generates the classes required to bind the views in the layout with your data objects.<br/>
</li>

<li>
<h4><i>Navigation component</i></h4> 
       - Navigation Graph.<br/>
       - Navigation Destination fragment.<br/>  
       - Safe Args.<br/>
</li>

<li>
<h4><i>Dagger-2</i></h4> 
       - Dependency Injection.<br/>
       - Testable code & Maintainable code<br/>  
       - Inject, Provides & Component<br/>
</li>

<li>
<h4><i>Gradle</i></h4> 
       - Libraries<br/>
       - Build Type<br/>  
       - Flavour<br/>
</li>

</ul>



