import React, { Component } from 'react';
import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider';
import AppBar from 'material-ui/AppBar';
import RaisedButton from 'material-ui/RaisedButton';
import TextField from 'material-ui/TextField';
function submit() {
  console.log("UserGroups created")
}
class AddUserGroups extends Component {
  constructor(props) {
    super(props);
    this.state = {
      Name: '',
      Address: '',
      City: '',
      State:'',
      Postalcode:''
    }
  }

  render() {
    return (
      <div>
        <MuiThemeProvider>
          <div>
            <AppBar
              title="JUGs User Groups"
            />
            <div style={{textAlign:"center"}}>
              <TextField
                hintText="Enter User Name"
                floatingLabelText=" Name"
                onChange={(event, newValue) => this.setState({ Name: newValue })}
              />
              <br />
              <TextField
                hintText="Enter User Address"
                floatingLabelText="Address"  
                onChange={(event, newValue) => this.setState({ Address: newValue })}
              />
              <br />
              <TextField
                hintText="Enter User City"
                floatingLabelText="City"
                onChange={(event, newValue) => this.setState({ City: newValue })}
              />
              <br />
              <TextField
                type="State"
                hintText="Enter User State"
                floatingLabelText="State/Province"
                onChange={(event, newValue) => this.setState({ State: newValue })}
              />
              <br />
              <TextField
                type="Postalcode"
                hintText="Enter User Postalcode"
                floatingLabelText="Postalcode"
                onChange={(event, newValue) => this.setState({ Postalcode: newValue })}
              />
              <br />
              <RaisedButton label="Submit" primary={true} style={m_15} onClick={submit} />
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


export default AddUserGroups;