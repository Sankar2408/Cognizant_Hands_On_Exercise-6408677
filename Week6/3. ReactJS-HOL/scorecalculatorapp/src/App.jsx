import './App.css';
import { CalculateScore } from './Components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore
        Name="Petchivaradhan L"
        School="St.John's Higher Secondary School"
        total={495}
        goal={500}
      />
    </div>
  );
}

export default App;
