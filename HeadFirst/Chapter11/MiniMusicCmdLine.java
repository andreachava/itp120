import javax.sound.midi.*;

public class MiniMusicCmdLine {
    public static void main(String[] args) {
        MiniMusicCmdLine mini = new MiniMusicCmdLine();
        if (args.length < 1) {
            System.out.println("Don't forget instrument and note args");
        } else {
            int instrument  = Integer.parseInt(args[0]);
            int rest = Integer.parseInt(args[1]); //now the two variables the user gives dictate the instrument and rest
            int [] song = {80, 80, 80, 60, 70, 80, 85, 95, 100, 60};
            for (int x = 0;x <10;x++) { //for loop iterates through array to play each note in song[]
                System.out.println(song[x]);
                mini.play(instrument, song[x], rest);
            } 
            System.exit(0);
        }
    }

    void play(int instrument, int note, int rest) { //added extra parameter rest to let user pick how much time is in between each note

        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            MidiEvent event = null;

            ShortMessage first = new ShortMessage();
            first.setMessage(192, 1, instrument, 0);
            MidiEvent changeInstrument = new MidiEvent(first, 1);
            track.add(changeInstrument);

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, note, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, note, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);
            player.setSequence(seq);
            player.start();

            Thread.sleep(rest); //inputs pre-set time in milliseconds

        } catch (Exception ex) {ex.printStackTrace();}
    }
}