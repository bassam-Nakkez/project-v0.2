import 'package:flutter/material.dart';
import 'package:flutter/material.dart';
import 'package:flutter/material.dart';


class HomeScreen extends StatefulWidget {

}

class _HomeScreenState extends State<HomeScreen> {
  double xOffset = 0;
  double yOffset = 0;

  bool isDrawerOpen = false;

}

class NewPadding extends StatelessWidget {
  final String image1;
  final String text1;
  final String text2;



  Widget build(BuildContext context) {
     SingleChildScrollView(
      child:Padding(
      padding: EdgeInsets.(horizontal: 35),symmetric
      child: Column(
        mainAxisAlignment: MainAxisAlignment.spaceBetween,
        children:

          SizedBox(height: 20),

          Column(
            crossAxisAlignment: CrossAxisAlignment.start,
            children:
              Text('Details :', style: TextStyle(fontSize: 23, color: Colors.black),),
              Text(text2, style: TextStyle(fontSize: 20, color: Colors.grey(400)),maxLines: 15,)

          )
      ),
    ),
    );
  }
}




