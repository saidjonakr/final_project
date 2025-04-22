import React from "react";
import { Button } from "@mui/material";
import { useHistory } from "react-router-dom";
import { logoutUser } from "../services/authUtils";

const LogoutButton = () => {
  const History = useHistory();

  const handleLogout = () => {
    logoutUser(History);
  };

  return (
    <Button
      variant="outlined"
      color="inherit"
      onClick={handleLogout}
      sx={{
        backgroundColor: "#E74C3C",
        color: "#fff",
        "&:hover": {
          backgroundColor: "#C0392B",
        },
      }}
    >
      Logout
    </Button>
  );
};

export default LogoutButton;

