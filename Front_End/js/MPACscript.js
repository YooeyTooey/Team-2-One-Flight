
const supportedAirlines = [
    { code: 'BR', name: 'Name 1' },
    { code: 'PR', name: 'Name 2' },
    { code: 'CX', name: 'Name 3' },
    { code: 'VN', name: 'Name 4' },
    { code: 'KE', name: 'Name 5' },
    { code: 'NH', name: 'Name 6' },
    { code: 'OZ', name: 'Name 7' },
    { code: 'ZP', name: 'Name 8' },
    { code: '2P', name: 'Name 9' },
    { code: 'JX', name: 'Name 10' },
  ];
  
  function displaySupportedAirlines() {
    const airlineList = document.querySelector('.airline-list ul');
    supportedAirlines.forEach(airline => {
      const listItem = document.createElement('li');
      listItem.textContent = `${airline.code} - ${airline.name}`;
      airlineList.appendChild(listItem);
    });
  }
  
  displaySupportedAirlines();
  