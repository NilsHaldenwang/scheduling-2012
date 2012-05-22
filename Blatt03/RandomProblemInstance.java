public class RandomProblemInstance {
  public int numberOfJobs;
  public Job[] jobs;
  public int maximumProcessingTime; // T

  public RandomProblemInstance(int size) {
    this.numberOfJobs = size;
    this.jobs = new Job[size];
    this.maximumProcessingTime = 0;

    for(int i = 0; i < size; i++) {
      Job newJob = Job.getRandomJob();

      jobs[i] = newJob;

      maximumProcessingTime += newJob.processingTime;
    }
  }
}
