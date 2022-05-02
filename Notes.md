<h3>Testing API with Postman</h3>
<pre>
1. Fetch record:
    query{
        getCat(c_id:2){
            id
            nickName
            age
        }
    
        testingApp
    
        getAllCats{
            id
            color
            nickName
            age
        }
    }

* Note: Above example is testing three different APIs
</pre>

<pre>
2. Save new record:
    mutation{
        saveCat(c:{id:123, nickName:"Rocket", color:"Golden", age:17}){
            id
            nickName
            age
        }
    }
    
* Note: c => InputType
</pre>
<pre>
3. Delete record:
    mutation{
        removeCat(id:1)
    }
</pre>

<pre>
4. Update record:
    mutation{
        updateCat(new_cat:{id:2,nickName:"nothing",color:"blue",age:500}){
            id
            color
            nickName
            age
        }
    }
</pre>
<pre>
5. saveCat(c_id: Int!, c_name: String!, c_color: String!, c_age: Int!): Cat!
   => while testing this API data must be passed as "c_id: X, c_name: X, c_color: X, c_age: X"
   
   saveCat(c: inputTypeCat): Cat!
   => while testing this API data must be passed as "c: {id: X, nickName: X, color: X, age: X}"
</pre>
<pre>
6. DO NOT FORGET TO ADD THE SELECTION FIELDS IN THE QUERY
</pre>
