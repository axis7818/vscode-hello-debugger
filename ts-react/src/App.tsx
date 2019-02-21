import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

export interface Props {
   name: string;
}

class App extends Component<Props> {

   render() {
      const name = this.props.name;
      return (
         <div className="App">
            <p>Hello {name}</p>
         </div>
      );
   }
}

export default App;
