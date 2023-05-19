import 'Files/DetailsScreen.dart';

Scaffold(
appBar: AppBar(
title:Text('Details')
backgroundColor: #2196f3
),
body:ListView(
  itemCount: 10,
  itemBuilder: (BuildContext Context, int index) {
   return  Container(
              width:200,
              height:200,
              color:Colors.green);
   }
   ),
 floatingActionButton:FloatingActionButton(onPressed: (){
                Navigator.of(context).push(MaterialPageRoute(builder:(context)=>DetailsScreen(i:"hazem" ,productID :250  ,  userID : 15  )));
                }
                )
);


// ////// ( Test Semantic Error )//////


//
//
// class car {
//
//
// String Color;
// String Color;
// int Number;
//
// car(){}
// void setNum( int num ){}
//
//
// void setNum( int num)
// {
// int x;
// int y;
// int x;
// }
//
// String getName(){
// int y;
// }
//
//
//
//
// @override
// String fun ( int v ){ return "Hi";}
//
// }
//
//
// class car{}
//
//
// int y = 5;
// int x = y + 4;


// Container(
// width:100,
// height:100,
// child:Container(
//     width:50,
//     height:50,
//     color:Colors.red,
//    )
// );
//
//
// Column(
//         children:
//
//            SizedBox(width:20),
//
//           Row(
//             children:
//               Text('Details :', style: TextStyle(fontSize: 23, color: Colors.black),),
//               SizedBox(height: 0.1
//               child:Text(text2, style: TextStyle(fontSize: 20, color: Colors.red))),
//               Text( text2, style: TextStyle(fontSize: 20, color: Colors.red)
//
//           )
//       ));
//


//
//
// TextFiled (width:20,decoration:InputDecoration(labelText:"hazem"),controller:x);
//

//
// Scaffold(
// body: Row( children:
//
//
//
//               Container(
//               width:200,
//               height:200,
//               color:Colors.blue),
//               Column(  children:
//                             Container(
//                             width:100,
//                             height:100,
//                             color:Colors.blue),
//                             Text(text2, style: TextStyle(fontSize: 40, color: Colors.red)),
//                            Container(
//                            width:100,
//                            height:100,
//                            color:Colors.red),
//                             Text(text3, style: TextStyle(fontSize: 20, color: Colors.red)),
//                         ),
//              Container(
//              width:100,
//              height:100,
//              color:Colors.red),
//                            Image(image:AssetImage('assets\\image\\a1.jpg') , width:200 , height:200),
//                            SizedBox(height:20),
//               Text('Details :', style: TextStyle(fontSize: 20, color: Colors.blue)
//               )
//                )
//                floatingActionButton:FloatingActionButton(onPressed: (){
//
//                if( i < 5) { }
//
//
//                } ),
//                 );




//
// .h15
// {
// color: green;
// font-size:70px;
// font-family:Arial , sans-serif;
// }
//
//
//
//
//
//
//
//
// TextFiled (width:20,decoration:InputDecoration(labelText:"hazem"),controller:x);


//
// Scaffold(
// body: Row( children:
//               Container(
//               width:200,
//               height:200,
//               color:Colors.blue),
//               Column(  children:
//                             Container(
//                             width:100,
//                             height:100,
//                             color:Colors.blue),
//                             Text(text2, style: TextStyle(fontSize: 40, color: Colors.red)),
//                            Container(
//                            width:100,
//                            height:100,
//                            color:Colors.red),
//                             Text(text3, style: TextStyle(fontSize: 20, color: Colors.red)),
//                         ),
//              Container(
//              width:100,
//              height:100,
//              color:Colors.red),
//                            Image(image:AssetImage('assets\\image\\a1.jpg') , width:200 , height:200),
//                            SizedBox(height:20),
//               Text('Details :', style: TextStyle(fontSize: 20, color: Colors.blue)
//               )
//                )
//                floatingActionButton:FloatingActionButton(onPressed: (){
//                 Navigator.of(context).push(MaterialPageRoute(builder:(context)=>test3(i:"hazem")));}));


