// // Script runs only when document is fully loaded
// document.addEventListener("DOMContenLoaded", function(){
//     document.getElementById("memberForm").addEventListener("submit", function(event) {
//         event.preventDefault(); // Prevent the form from submitting the traditional way
      
//         const formData = new FormData(this); // Create a FormData object from the form
//         const url = "http://0.0.0.0:8000/api/v1/members"; // Api server URL
      
//         fetch(url, {
//           method: "POST",
//           body: formData
//         })
//         .then(response => response.json()) // Assuming the server responds with JSON
//         .then(data => {
//           // Handle the response from the server here
//           console.log("Server response:", data);
//         })
//         .catch(error => {
//           console.error("Error:", error);
//         });
//       });
      
// });

document.getElementById("memberForm").addEventListener("submit", function(event) {
        event.preventDefault(); // Prevent the form from submitting the traditional way
      
        const formData = new FormData(this); // Create a FormData object from the form
        const url = "http://127.0.0.1:8000/api/v1/members"; // Api server URL
      
        fetch(url, {
            method: "POST",
            //headers: {
            //"Content-Type": "application/json",
        //},

        body: JSON.stringify({formData}) // convert data to json format
        })
        .then(response => response.json()) // Assuming the server responds with JSON
        .then(data => {
          // Handle the response from the server here
          console.log("Server response:", data);
        })
        .catch(error => {
          console.error("Error:", error);
        });
      });
