document.addEventListener('DOMContentLoaded', function() {
    const activateBtn = document.getElementById('activateBtn');
    const deactivateBtn = document.getElementById('deactivateBtn');
  
    activateBtn.addEventListener('click', function() {
      // Perform activation logic based on selected role
      const selectedRole = document.getElementById('userRole').value;
      activateUser(selectedRole);
    });
  
    deactivateBtn.addEventListener('click', function() {
      // Perform deactivation logic based on selected role
      const selectedRole = document.getElementById('userRole').value;
      deactivateUser(selectedRole);
    });
  
    function activateUser(role) {
      // Implement activation logic here
      console.log(`Activating ${role} user...`);
      // This is where you would write the code to activate the user based on their role
    }
  
    function deactivateUser(role) {
      // Implement deactivation logic here
      console.log(`Deactivating ${role} user...`);
      // This is where you would write the code to deactivate the user based on their role
    }
  });  