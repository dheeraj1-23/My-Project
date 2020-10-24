import React, { Component } from 'react';
import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider';
import AppBar from 'material-ui/AppBar';
import RaisedButton from 'material-ui/RaisedButton';
import TextField from 'material-ui/TextField';
import { useHistory } from 'react-router-dom';
let history = useHistory();

  function handleClick() {
    history.push("/home");
  }
function submit() {
  console.log("clicked submit button")
}
class Registerpage extends Component {
    
  constructor(props) {
    super(props);
    this.state = {
      first_name: '',
      last_name: '',
      confirm_password: ''
    }
  }

  render() {
    return (
      <div>
        <MuiThemeProvider>
          <div>
            <AppBar
              title="Admin Registration page"
            />
            <div style={{textAlign:"center"}}>
              <TextField
                hintText="Enter your First Name"
                floatingLabelText="First Name"
                onChange={(event, newValue) => this.setState({ first_name: newValue })}
              />
              <br />
              <TextField
                hintText="Enter your Last Name"
                floatingLabelText="Last Name"
                onChange={(event, newValue) => this.setState({ last_name: newValue })}
              />
              <br />
              <TextField
          
                hintText="Enter your Password"
                floatingLabelText="Password"
                onChange={(event, newValue) => this.setState({ password: newValue })}
              />
              <br />
              <TextField
                type="Confirm password"
                hintText="Enter your Confirmation Password"
                floatingLabelText="Confirm Password"
                onChange={(event, newValue) => this.setState({ confirm_password: newValue })}
              />
              <br />
              <RaisedButton label="Submit" primary={true} style={m_15} onClick={submit} />
              <span>Already Registered?<button type="button" className={link} onClick={handleClick}>Login</button></span>
            </div>

          </div>
        </MuiThemeProvider>
      </div>
    );
  }
}
const m_15 = {
  margin: 15,
};
const link={
color:"blue"
}


export default Registerpage;